/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvparser;

import java.io.IOException;

/**
 *
 * @author olojo5
 */
public class ModifyCSV {
    ModifyCSV() throws IOException{
        String file_import = "C:temp\\2018-11-28\\import.csv";
        String file_export = "C:temp\\export.csv";
        new GenerateFile(file_import, file_export, 6, 8);
    }
}
