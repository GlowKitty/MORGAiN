package com.example.glowkitty.morgain;

/**
 * Created by glowkitty on 11/29/2016.
 */


import java.util.Properties;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;


public class SentimentAnalyzer {
    private int sentiment = 0;
    private Annotation a;
    private StanfordCoreNLP p;

    public SentimentAnalyzer() {
        //do nothing? i think?
    }

    public SentimentAnalyzer(String input) {
        this.startAnnotate(input);
    }

    private void startAnnotate(String input) {
        //start nlp pipeline
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, parse, sentiment");
        p = new StanfordCoreNLP(props);

        a = new Annotation(input);
        p.annotate(a);
    }

    public String getAnnotate(String input) {
        this.startAnnotate(input);
        return a.toString();
    }
}
