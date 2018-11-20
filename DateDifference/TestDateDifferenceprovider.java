package DateDifference;

public class TestDateDifferenceprovider {

	public static void main(String args[]) {

		MyTestRecord[] testrecords = new MyTestRecord[15];
		testrecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(
				20, 11, 2018), 0);
		//testrecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(
				//30, 11, 2018), 0);

		for (MyTestRecord record : testrecords) {

			int actualDifference = DateDifferenceProvider.getDifference(record.getStartDate(), record.getEndDate());

			if (actualDifference == record.getDifference()) {

				System.out.println("Test Case passed");

			} else {
				System.err.println("Test Case failed");
			}

		}

	}
}