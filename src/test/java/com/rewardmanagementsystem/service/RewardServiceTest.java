package com.rewardmanagementsystem.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RewardServiceTest {
	
	@Test
	public void shouldReturnOneWhenValuesisLessTannTen() {
		RewardService rewardService = new RewardService();
		int points = rewardService.calculateRewards(10);
		
		assertEquals(1, points);
	}
	
	@Test
	public void shouldReturnTwoWhenValueIsGreaterTanTenAndLessThanTwenty() {
		RewardService rewardService = new RewardService();
		int points = rewardService.calculateRewards(20);
		
		assertEquals(2, points);
	}
	
	@Test
	public void shouldReturnThreeWhenValueIsGreaterThanTwenty() {
		RewardService rewardService = new RewardService();
		int points = rewardService.calculateRewards(22);
		
		assertEquals(3, points);
	}


}
