

public class Primer {
	//
	public int oddOrPos(int[] x) {
		int count = 0;
<<<<<<< HEAD
		for (int i = 0; i < x.length + 1; i++) {
			if (x[i] % 2 == 1 || x[i] > 0) {
=======
		for (int i = 0; i < x.length; i++) {
<<<<<<< HEAD
			if (x[i] % 2 == 1 && x[i] > 0) {
=======
			if (x[i] % 2 == 1 || x[i] > 0) {
>>>>>>> Ime-Prezime-dev
>>>>>>> Ime-Prezime
				count++;
			}
		}
		return count;
	}
	// test: x = [-3, -2, 0, 1, 4]; Expected = 3

}

