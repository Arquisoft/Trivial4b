package es.uniovi.asw.trivial;

public class Extractor {

	public void usage() {
		System.out.println("Wellcome to Trivial Extractor");
	}

	public int run(String[] args) {
		if (args.length != 4) {
			usage();
			return 0;
		} else {
			
		}
		return -1;
	}

	public static void main(String[] args) {
		new Extractor().run(args);
	}
}
