package javaProject.Lesson20;

public class Lesson20_exercise {

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		TvShow tvshow1 = new TvShow("Drama");
		TvShow tvshow2 = new TvShow("Action");
		TvShow tvshow3 = new TvShow("Movie");
		
		System.out.println(TvShow.numShows);
		
		System.out.println(tvshow1.numberOfShows()); 
		System.out.println(TvShow.actor2);
		
		TvShow chrs = new TvShow("Cheers");
		System.out.println(TvShow.x); // 59
		System.out.println(chrs.x); // 59
		
		TvShow hc = new TvShow("History Channel");
		hc.x = 160;
		System.out.println(TvShow.x); // 160
		System.out.println(hc.x); // 160
	}

}
