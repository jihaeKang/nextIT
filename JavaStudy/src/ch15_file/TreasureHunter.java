package ch15_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TreasureHunter {

	public static void main(String[] args) {
		String path = "/home/pc10/today/treasure";
		
		// treasure 폴더 내 파일을 먼저 찾기!!
		// 선착순 3명
		
		File t = new File(path);
		
		File[] arr = t.listFiles();
		
		System.out.println(t);
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].isDirectory()) {
//				// 폴더
//				File[] arrr = arr[i].listFiles();
//				for(int k = 0; k < arrr.length; k++) {
//					if(arrr[k].isDirectory()) {
//						File[] arrrr = arrr[k].listFiles();
//					}else {
//						System.out.println(arrr[k]);
//					}
//				}
				
				findFile(t);
				
				
				
				

		
		
		

	
		
		
		
		
		
		
		

	}
	
	
	public static void findFile(File folder) {
		File[] inner = folder.listFiles();
		for(int i = 0; i < inner.length; i++) {
			if(inner[i].isDirectory()) {
				findFile(inner[i]);
				
			}else {
				System.out.println(inner[i]);
			}
		}
		
	}

}
