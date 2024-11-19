package com.driver;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MilkDairyFarmService {
	private Map<Integer, Cow> cowDatabase;
    private int nextCowId;

    public MilkDairyFarmService() {
    	// your code goes here
    }

    public Cow addCow(Cow cow) {
    	// your code goes here
        return cow;
    }

    public Cow getMilkProduction(int cowId) {
    	// your code goes here
        return cowDatabase.get(cowId);
    }

    public double getTotalMilkProduction() {
    	// your code goes here
        return cowDatabase.values().stream().mapToDouble(Cow::getMilkProduction).sum();
    }
}
