package simpleVersion;

import java.util.Scanner;

public class Main {
	
	public static void play(char[][] board) {
		Scanner read = new Scanner(System.in);
		char player;
		int input; 
		int round = 1;
		boolean finished = false; 
		
		while (!finished) {
			if (round % 2 == 0) {
				player = 'O';
			} else { 
				player = 'X';
			}
						
			System.out.println("\nSpiller " + player + ", velg rad: ");
			input = read.nextInt() - 1;
			int row = 5;  //Start at bottom row
			boolean added = false;
			
			while (!added)
				if (board[row][input] ==' ') {
					board[row][input] = player; 
					added = true;
				} else {
					row--;
				}
			round++;
			print(board);
			finished = checkWinCondition(board, row, input, player);
		}
		read.close();
	}
	public static boolean checkWinCondition(char[][] board, int row, int input, char player) {
		
		boolean finished; 
		String streak = String.format("%c%c%c%c", player, player, player, player);
		
		finished =  contains(horizontal(board, row), streak) || 
					contains(vertical(board, input), streak) ||
					contains(diagonalLeftToRight(board, row, input), streak) ||
					contains(diagonalRightToLeft(board, row, input), streak);
		
		if (finished) {
			System.out.println("Gratulerer! Spiller " + player + " har vunnet!");
		}
		
		return finished;
	}
	
	public static String horizontal(char[][] board, int row) {
		StringBuilder sb = new StringBuilder(6);
		for(int i = 0; i < 6; i++) {
			sb.append(board[row][i]);
		}
		return sb.toString();
	}
	public static String vertical(char[][] board, int input) {
		StringBuilder sb = new StringBuilder(6);
		
		for(int i = 0; i < 6; i++) {
			sb.append(board[i][input]);
		}
		return sb.toString();
	}
	
	public static String diagonalLeftToRight(char[][] board, int row, int input) {
		StringBuilder sb = new StringBuilder(6);
		
		for (int i = 0; i < 6; i++) {
			int w = row + input - i; 
			
			if(w >= 0 && w < 7) {
				sb.append(board[i][w]);
			}
		}
		return sb.toString();
	}
	
	public static String diagonalRightToLeft(char[][] board, int row, int input) {
		StringBuilder sb = new StringBuilder(6); 
		
		for (int i = 0; i < 6; i++) {
			int w = row - input + i; 
			
			if(w >= 0 && w < 7) {
				sb.append(board[i][w]);
			}
		}
		return sb.toString();
	}
	public static boolean contains(String str, String substr) {
		return str.indexOf(substr) >= 0;
	}
	
	public static char[][] create() {
		char[][] board = new char[6][7]; 
		for (int k = 0; k < 6; k++) {
			for (int m = 0; m < 7; m++) {
				board[k][m] = ' ';
			}
		}
		return board;
	}
	public static void print(char[][] board) {
		for (int m = 1; m <= board.length + 1; m++) {
			System.out.print("[" + m + "]");
		}
		System.out.println("");
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("[" + board[i][j] + "]");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		char board[][] = create(); 
		
		System.out.println("Velkommen til 4 på rad!\n");
		
		print(board);
		
		play(board);
	
	}
}
