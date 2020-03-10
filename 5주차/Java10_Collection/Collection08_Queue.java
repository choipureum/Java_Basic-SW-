package Java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection08_Queue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList(); //<Integer> generics
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		//FIFO (먼저 들어오면 먼저 나간다)
		//큐는 많이 쓰인다
		//대기열 알고리즘
		
		//기능들
		System.out.println(q.peek()); //다음출력될 수 미리보기
		System.out.println(q.size()); //q의 크기
		System.out.println(q.isEmpty()); //비엇나?
	
	}
}

//< 큐, Queue > 
//
//	-FIFO, 선입선출
//	-LILO, 후입후출
//	-FCFS 알고리즘, First Come First Served (대기열 시스템)
//
//	-대기열 시스템 구출할 때 사용한다
//
//	-자바에서 Queue는 interface로만 제공된다
//	-구현체는 LinkedList를 주로 사용한다	
//  
//  < interface Queue 주요 메소드(알고리즘) >
//
//	-offer() : 데이터 입력, 데이터를 enqueue
//	-poll() : 데이터 출력, 데이터를 dequeue 및 제거
//	-peek() : Stack peek()과 동일
//
//	*enqueue : 큐에 데이터 삽입하기(적용하기)
//	*dequeue : 큐에 데이터 제거하기
