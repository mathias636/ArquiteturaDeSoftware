/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state;

/**
 *
 * @author elton.fribeiro
 */
public interface Estado {
  public void abaixando();
  public void correndo();
  public void esperando();
  public void pulando();
}
