package Session9.Assignments3;

	public class HDTV implements Comparable<HDTV>{
		private String brandName;
		private int size;
		
		public HDTV(String brandName, int size){
			this.brandName = brandName;
			this.size = size;
		}


		@Override
		public int compareTo(HDTV o) {
			// TODO Auto-generated method stub
			if(size > o.size) return -1;
			else if(size < o.size) return 1;
			else return 0;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return size + "\" " + brandName + " TV";
		}
}
