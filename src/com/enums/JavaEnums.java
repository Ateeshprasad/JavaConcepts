package com.enums;

public class JavaEnums {

	public enum Seasons {
		WINTER(24), SUMMER(64), SPRING(17), FALL(34);

		public int value;

		private Seasons(int val) {
			this.value = val;
		}

		public int getVal() {
			return 10;
		}
	}

	public static void main(String args[]) {
		System.out.println(Seasons.SPRING);

		for (Seasons season : Seasons.values()) {
			System.out.print(season + " ");
			System.out.println(season.getVal());
		}
	}

}
