/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test

object CSVtoJSON {
  import java.io.BufferedReader;
import java.io.FileReader;
import org.json._
import scala.io.Source

var br = new BufferedReader(new FileReader("/temp/testi.txt"))
var contentLine = br.readLine();
var keys = contentLine.split(",")
contentLine = br.readLine();
var ja = new JSONArray();
while (contentLine != null) {
    var splits = contentLine.split(",")
    var i = 0
    var jo = new JSONObject()
    for(i <- 0 to splits.length-1){
        jo.put(keys(i), splits(i));    
    }
    ja.put(jo);
    contentLine = br.readLine();
}
}
