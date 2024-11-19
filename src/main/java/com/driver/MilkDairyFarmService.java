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
        this.cowDatabase = new HashMap<>();
        this.nextCowId = 1;
    }

    public Cow addCow(Cow cow) {
    	// your code goes here
        cow.setId(nextCowId++);
        cowDatabase.put(cow.getId(),cow);
        return cow;
    }

    public Cow getMilkProduction(int cowId) {
    	// your code goes here
        return cowDatabase.getOrDefault(cowId, null);
    }

    public double getTotalMilkProduction() {
    	// your code goes here
        return cowDatabase.values()
                .stream()
                .mapToDouble(Cow::getMilkProduction)
                .sum();
    }
}
