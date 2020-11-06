/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package over_ridding;

/**
 *
 * @author Bilal
 */
public class B extends A
{
    int b;
    @Override
    void shery()
    {
        System.out.println("Class B");
    }
    void xyz()
    {
        super.shery();
    }
}
