package com.rewardmanagementsystem.service;

import org.springframework.stereotype.Service;

@Service
public class RewardService {
	public int calculateRewards(float purchaseAmount)
	{
		int rewardPoints =0;
		if(purchaseAmount <= 0) {
			rewardPoints = 0;
		}
		else if(10  >= purchaseAmount && purchaseAmount >0)
		{
			rewardPoints = 1; 
		}
		else if(20 >= purchaseAmount && purchaseAmount >11)
		{
			rewardPoints = 2;
		}
		else
		{
			rewardPoints = 3;
		}
			
		return rewardPoints;
	}

}
