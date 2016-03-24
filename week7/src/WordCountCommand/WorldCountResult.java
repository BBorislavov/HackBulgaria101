package WordCountCommand;


public class WorldCountResult {
	
	private int mWordCount;
	private int mLinesCount;
	private int mCharactersCount;
	
	public WorldCountResult(int wordCount, int linesCount, int charactersCount) {
		mWordCount = wordCount;
		mLinesCount = linesCount;
		mCharactersCount = charactersCount;
	}

	public int getWordCount() {
		return mWordCount;
	}
	
	public int getLinesCount() {
		return mLinesCount;
	}
	
	public int getCharactersCount() {
		return mCharactersCount;
	}
	
	@Override
	public String toString() {
		String result;
		result = "Word count: " + mWordCount + ", Lines Count: " + mLinesCount + 
				", Characters count " + mCharactersCount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.getClass() != this.getClass()) {
			return false;
		}
		
		WorldCountResult other = (WorldCountResult) obj;
		
		if(mWordCount == other.getWordCount() && mLinesCount == other.getLinesCount() && 
				mCharactersCount == other.getCharactersCount()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		Integer wordCount = mWordCount;
		Integer linesCount = mLinesCount;
		Integer charCount = mCharactersCount;
		return wordCount.hashCode() * 11 + linesCount.hashCode() * 7 + charCount.hashCode() * 27;
	}
}