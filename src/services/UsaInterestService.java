package services;

public class UsaInterestService implements InterestService {

	private double interesRate;// taxa de juros

	public UsaInterestService(double interesRate) {
		this.interesRate = interesRate;
	}

	@Override
	public double getInterestRate() {
		return interesRate;
	}

}