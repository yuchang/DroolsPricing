package com.capgemini.ate.pricing;

import org.drools.KnowledgeBase;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import com.capgemini.ate.pricing.rules.DroolsUtil;



public class AppPricing {

	public static void main(String[] args) throws Exception {
		KnowledgeBase kBase = DroolsUtil.readKnowledgeBase("/com/capgemini/ate/pricing/Pricing.drl");
		StatefulKnowledgeSession kSession = kBase.newStatefulKnowledgeSession();
		KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(kSession, "DroolsPricing");
		
		
		
		kSession.fireAllRules();
		kSession.dispose();         
        logger.close();
	}

}
