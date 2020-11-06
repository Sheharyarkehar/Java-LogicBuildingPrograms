/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4;

/**
 *
 * @author Bilal
 */

public class staff extends employee {
    public void title(String title){
        System.out.println("title is"+title);
    
    }
    @Override
    public void name(String name)
    {
    
    super.name(name);
    }
}