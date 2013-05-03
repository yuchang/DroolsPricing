package com.capgemini.ate.pricing.rules;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;

public class DroolsUtil {

    public static KnowledgeBase readKnowledgeBase(String... drlFileNames) throws Exception {
        KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        // This parses and compiles a DRL file.
        for (String drlFileName: drlFileNames) {
            kBuilder.add(ResourceFactory.newClassPathResource(drlFileName, com.capgemini.ate.pricing.AppPricing.class), ResourceType.DRL);
            if (kBuilder.hasErrors()){
                for (KnowledgeBuilderError err: kBuilder.getErrors()) {
                    System.out.println(err.toString());
                }
                throw new IllegalStateException("DRL errors");
            }
        }

        // Add the package to a knowledge base (deploy the rule package).
        KnowledgeBaseConfiguration kBaseConfig = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();

        KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase(kBaseConfig);
        kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
        return kBase;
    }

}
