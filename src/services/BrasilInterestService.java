package services;

public class BrasilInterestService implements InterestService {

	private double interesRate;// taxa de juros

	public BrasilInterestService(double interesRate) {
		this.interesRate = interesRate;
	}

	@Override
	public double getInterestRate() {
		return interesRate;
	}

}