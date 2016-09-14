
public class Main {

	public static void main(String[] args){

		ContactComparator comp = new ContactComparator();

		Contact[] testList = new Contact[26];
		testList[0] = new Contact("AAron", "Black", "Array Listery", "1-234-567-8900", "1-555-432-3456", "1-875-234-9765", "ABlack@esnail.edu");
		testList[1] = new Contact("Barry", "HornField", "Array Listery", "1-766-900-1234", "1-233-543-6547", "1-875-234-9765", "BField@esnail.edu");
		testList[2] = new Contact("Corey", "Karington", "Array Listery", "1-678-000-2578", "1-222-666-7777", "1-875-234-9765", "CKarington@esnail.edu");
		testList[3] = new Contact("Darrel", "Worther", "Array Listery", "1-000-333-6666", "1-030-494-8901", "1-875-234-9765", "DWorther@esnail.edu");
		testList[4] = new Contact("Ellen", "Smith", "Array Listery", "1-857-000-5432", "1-666-908-9900", "1-875-234-9765", "ESmith@esnail.com");
		testList[5] = new Contact("Francis", "Forello", "Array Listery", "1-000-923-4455", "1-667-333-5970", "1-875-234-9765", "FForello@esnail.com");
		testList[6] = new Contact("Greg", "Moore", "Array Listery", "1-456-111-2345", "1-999-567-4968", "1-875-234-9765", "GMoore@esnail.com");
		testList[7] = new Contact("Hellena", "Snarl", "Array Listery", "1-831-844-4868", "1-789-321-7813", "1-875-234-9765", "HSnarl@esnail.com");
		testList[8] = new Contact("Isabell", "Berkley", "Array Listery", "1-987-654-1478", "1-987-789-1236", "1-875-234-9765","EBerkley@esnail.com");
		testList[9] = new Contact("Julie", "Jensen", "Array Listery", "1-222-666-7894", "1-321-654-7899", "1-875-234-9765", "JJensen@esnail.com");
		testList[10] = new Contact("Kyle", "McDoogle", "Array Listery", "1-888-335-6598", "1-321-789-4598", "1-875-234-9765","KMcDoogle@esnail.com");
		testList[11] = new Contact("Lawrence", "Flemming", "Array Listery", "0-555-985-4895", "1-456-456-1687", "1-875-234-9765","LFlemming@esnail.com");
		testList[12] = new Contact("Mike", "Glasgo", "Array Listery", "", "", "1-875-234-9765","MGlasgo@esnail.com");
		testList[13] = new Contact("Nedward", "Wentsworth", "Array Listery", "1-440-563-8915", "1-458-832-3456", "1-875-234-9765", "NWentsworth@esnail.com");
		testList[14] = new Contact("Oskarr", "Squinktersmith", "Array Listery", "1-486-891-1111", "", "1-875-234-9765", "OSquinktersmith@esnail.com");
		testList[15] = new Contact("Patricia", "Merkel", "Array Listery", "1-483-332-5612", "", "1-875-234-9765", "PMerkel@esnail.com");
		testList[16] = new Contact("Qitra", "Sorrento", "Array Listery", "1-878-879-9999", "", "1-875-234-9765","QSorrento@esnail.com");
		testList[17] = new Contact("Ralph", "Flemming", "Array Listery", "1-487-323-5689", "1-888-945-3654", "1-875-234-9765", "RFlemming@esnail.com");
		testList[18] = new Contact("Samial", "Smith", "Array Listery", "1-857-000-4457", "1-666-908-9900", "1-875-234-9765", "SSmith@esnail.com");
		testList[19] = new Contact("Tedward", "Wentsworth", "Array Listery", "1-542-789-8888", "", "1-875-234-9765", "TWentsworth@esnail.com");
		testList[20] = new Contact("Urdel", "Flippenstock", "Array Listery", "", "1-555-666-9898", "1-875-234-9765", "UFlippenstock@esnail.com");
		testList[21] = new Contact("Valentina", "Ferrara", "Array Listery", "1-856-489-3278", "", "1-875-234-9765", "VFerrara@esnail.com");
		testList[22] = new Contact("Waldo", "Arlington", "Array Listery", "", "", "1-875-234-9765", "WArlington@esnail.com");
		testList[23] = new Contact("Xeekiel", "Quint", "Array Listery", "", "", "1-875-234-9765", "XQuint@esnail.com");
		testList[24] = new Contact("Yannie", "Alexzandrovich", "Array Listery", "", "1-842-876-2414", "1-875-234-9765", "YAlexzandrovich@esnail.com");
		testList[25] = new Contact("Zebadia", "Ford", "Array Listery", "1-648-348-6844", "1-757-681-8645", "1-875-234-9765", "ZFord@esnail.com");

		Contact[] contactList = new Contact[20];

		MyArrayList contacts = new MyArrayList(contactList, comp);

//		for(int i = 0; i < 20; i ++){
//			contacts.add(testList[i]);
//		}
//
//		for(int i = 1; i < 3; i ++){
//			contacts.add(i * 6, testList[20 + i]);
//		}
//
//		contacts.set(11, testList[24]);
//		contacts.set(1, testList[25]);
//		contacts.remove(17);

		for(int i = 0; i < contacts.size(); i ++){
			System.out.println(contacts.get(i).toString());
		}

	}
}
