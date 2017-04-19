package comp110.filters;

import comp110.Image;

/**
 * Author:
 *
 * ONYEN:
 *
 * Collaborator(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class SaturationFilter implements Filter {

	public Image process(Image input) {
		// TODO:
		return input;
	}

	/*
	 * 110-provided code below. You should understand what it all does but you
	 * should not modify.
	 */
	private double _amount;

	public SaturationFilter(double amount) {
		_amount = amount;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String toString() {
		return "Saturation";
	}

}