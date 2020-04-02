package hu.markgyori.game_4096;

/**
 * Class for game configuration.
 * @author marko
 *
 */
public enum Config {

	WIDTH(600),
	HEIGHT(600),
	SIZE(5),
	ADDED_BLOCKS(2);

	private int value;

	Config(int value) {
		this.value = value;
	};

	public int GetValue() {
		return this.value;
	}

	public static String[] colors = new String[] { "#e9faa7", "#49d186", "#25b867", "#187843", "#1d968c", "#1d7096",
			"#1f2aa3", "#9514db", "#d41eb8", "#e01063", "#ff0a3b", "#940925", "#b52414" };
}