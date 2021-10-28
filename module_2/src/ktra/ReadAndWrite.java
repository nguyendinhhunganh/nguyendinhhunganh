package ktra;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    public static void writeCharacter(ArrayList<SanPham> arrayList, String address){
        File file = new File(address);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPham sanPham : arrayList) {
                bufferedWriter.write(sanPham.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
