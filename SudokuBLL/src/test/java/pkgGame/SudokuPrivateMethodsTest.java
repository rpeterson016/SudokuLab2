package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuPrivateMethodsTest {
	
	private void PrintStars() {
		for(int i = 0; i < 100; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	@Test
	public void setRegion_Test() {
		
		Sudoku s1 = null;
		int puzzleSize = 9;
		int[] iExpectedReg = new int[puzzleSize];
		int[] iActualReg;
		for (int i=0; i<puzzleSize; i++) {
			iExpectedReg[i] = i + 1;
		}

		try {
			
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor<?> constr = c.getConstructor(new Class[] {int.class});
			constr.setAccessible(true);
			s1 = (Sudoku) constr.newInstance(puzzleSize);
			
			Method meth = c.getDeclaredMethod("SetRegion", new Class[] { int.class });
			meth.setAccessible(true);
			meth.invoke(s1, 0);
			iActualReg = s1.getRegion(0);
			
			assertTrue(Arrays.equals(iExpectedReg, iActualReg));
			
			PrintStars();
			s1.PrintPuzzle();
			PrintStars();
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {  
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			PrintStars();
		}
	
	/*
	 * Hi Alex :)
	 */
	
	@Test
	public void FillDiagonalRegions_Test() {
		Sudoku s1 = null;
		int puzzleSize = 9;
		
		try {
			
			Class<?> cls = Class.forName("pkgGame.Sudoku");
			Constructor constr = cls.getConstructor(new Class[] { int.class });
			constr.setAccessible(true);
			s1 = (Sudoku) constr.newInstance(puzzleSize);
			System.out.println("Original Puzzle:");
			
			Method meth = cls.getDeclaredMethod("FillDiagonalRegions", null);
			
			s1.PrintPuzzle();
			PrintStars();
			
			meth.setAccessible(true);
			meth.invoke(s1, null);
			
			System.out.println("Modified Puzzle:");
			s1.PrintPuzzle();
			System.out.println(Arrays.toString(s1.getRegion(0)));
			
			PrintStars();
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
