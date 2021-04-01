package baylor.edu.csi3471.thread;

import java.util.LinkedList;

class CubbyHole {
	private LinkedList<Integer> seq = new LinkedList<>();
	private boolean available = false;
	private int count = 0;

	public synchronized int get() {
		while (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		count--;
		notify();
		return seq.remove();
	}

	public synchronized void put(int value) {
		while (count >= 10) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		seq.add(value);
		count++;
		available = true;
		notify();
		
	}
}