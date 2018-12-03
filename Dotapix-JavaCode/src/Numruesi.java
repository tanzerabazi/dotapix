public class Numruesi {
	private int count;

	public Numruesi(int start) {
		count = start;
	}

	public void increment() {
		count = count + 1;
	}

	public int countOf() {
		return count;
	}
	public void setCount(int count){
		this.count=count;
	}

	public boolean checkOf() {
		boolean mbaroi = false;
		if (count > 23) {
			mbaroi = true;
		}
		return mbaroi;
	}
}