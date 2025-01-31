package util;

import java.io.File;
// Ctrl + Shift + O 자동 import
// Ctrl + Shift + F 자동 들여쓰기

public class FileUtil {

	// 폴더 삭제 재귀 함수

	// 중복함수( 오버로딩 )
	// .\src\days09\Ex03_03.java
	// 파일명 Ex03_03.java
	public static String getFileName(File f) {
		String fileName = f.getName();
		return fileName;
	}

	// .\src\days09\Ex03_03.java
	public static String getFileName(String pathname) {
		int idx = pathname.lastIndexOf("\\");
		String fileName = pathname.substring(idx + 1);
		return fileName;
	}

	// .Ex03_03.java
	public static String getExtension(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String ext = fileName.substring(idx);
		return ext;
	}

	// Ex03_03.java
	// Ex03_03
	public static String getBaseName(String fileName) {
		int idx = fileName.lastIndexOf(".");
		String baseName = fileName.substring(0, idx);
		return baseName;
	}

	// 삭제 재귀 함수
	public static void directoryDelete(File f) {
		while (!f.delete()) {
			File[] list = f.listFiles();
			for (int i = 0; i < list.length; i++) {
				if (list[i].delete()) {
					// System.out.printf( "%s 삭제 완료.\n", list[i] );
				} else {
					directoryDelete(list[i]);
				}
			} // if
		} // while
			// System.out.printf("%s 폴더+하위폴더 삭제 완료!!! \n", f);
	} // directoryDelete
}
