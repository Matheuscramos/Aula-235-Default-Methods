package services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {

	private double interesRate;// taxa de juros

	public UsaInterestService(double interesRate) {
		this.interesRate = interesRate;
	}

	@Override
	public double getInterestRate() {
		return interesRate;
	}

	@Override
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");

		}
		return amount * Math.pow(1.0 + interesRate / 100.0, months);

	}
}