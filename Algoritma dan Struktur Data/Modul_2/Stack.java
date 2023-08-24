package Modul_2;
public class Stack {
    Node top;
	/*Node top berfungsi umendeklarasikan top ke dalam bentuk tioe data node */
	
	boolean isEmpty(){
		/*scrip isEmpety berfungsi untuk menegecek apakah stack sudah terisi atau belum */
		return top == null;
	}
	void push(String elemen) {
		/*method push berfungsi untuk menambah objek elemen ke dalam stack  */
		Node baru = new Node(elemen);
		/*membuat kondisi ketika push masih belum terisi data node*/
		if (isEmpty()) {
			/*scrip if() berfungsi untuk menentukan kondisi apakah kondisi tersebbut sesuai dengan method isEmpety() atau tidak */
			top = baru;
			return;
			/*jika kondisi if() terpenuhi maka akan mengeksekusi top = baru dan nge return node tersebut */
		}
		baru.next = top;
		top = baru;
	}
	String pop(){
		/*method pop berfungsi untuk mengambil nilai pada stack*/
		if(isEmpty()){
			/*kondisi if() berfungsi untuk menegecek apakah top terisi data stack atau tidak */
			return"";
			/*jka iya, maka akan mengeksekusi return node tersebut*/
		}
		/*jikta tidak, maka akan mengambil nilai pada stack*/
		String atas = top.elemen;
		top = top.next;
		return atas;
	}
	String gettop(){
		/*method gettop berfungsi unutk menunjuk nilai top pada stack*/
		return top.elemen;
	}
}
