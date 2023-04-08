package À¶ÇÅ¹ÙÍøÆßÈÕ¼¯Ñµ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class ×óÒÆÓÒÒÆ {
	public static void main(String[] args) throws IOException{
		StreamTokenizer input = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		int N = (int)input.nval;
		input.nextToken();
		int M = (int)input.nval;
		Link link = new Link();
		for(int i = 1; i <= N; i++) {
			link.insert(i);
		}
		for(int i = 0; i < M; i++) {
			input.nextToken();
			char flag = input.sval.charAt(0);
			input.nextToken();
			int num = (int)input.nval;
			link.change(flag, num);
		}
		link.print();
//		link.insert(1);
//		link.insert(3);
//		link.print();
	}
}
class Link{
	private link_Node first;
	private link_Node last;
	int size;
	
	public void insert(int x) {
		link_Node t = new link_Node();
		t.data = x;
		if(size == 0) {
			first = t;
			last = t;
		}else {
			this.last.next = t;
			last = t;
		}
		size++;
	}
	public void print() {
		link_Node t = first;
		for(int i = 0; i < size; i++) {
			System.out.print(t.data + " ");
			t = t.next;
		}
	}
	public void change(char flag, int x) {
		//Ñ°ÕÒ½Úµã
		link_Node t = first;
		if(t.data == x && flag == 'L')return;
		if(last.data == x && flag == 'R')return;
		while (t.next.data != x) {
			t = t.next;
		}
		link_Node change_node = t.next;
		t.next = change_node.next;
		if(flag == 'L') {
			change_node.next = first;
			first = change_node;
		}
		else {
			change_node.next = null;
			last.next = change_node;
			last = change_node;
		}
	}
}
class link_Node {
	int data;
	link_Node next;
}

