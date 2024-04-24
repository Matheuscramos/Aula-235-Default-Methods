package services;

import java.security.InvalidParameterException;

public class BrasilInterestService {

	private double interesRate;// taxa de juros

	public BrasilInterestService(double interesRate) {
		this.interesRate = interesRate;
	}

	public double getInteresRate() {
		return interesRate;
	}

	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");

		}
		return amount * Math.pow(1.0 + interesRate / 100.0, months);

	}
}