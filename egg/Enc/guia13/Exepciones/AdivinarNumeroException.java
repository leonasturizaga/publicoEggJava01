/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author lion
 */
public class AdivinarNumeroException extends Exception {

/**
 * Creates a new instance of <code>AdivinarNumeroExepcion</code> without detail
 * message.
 */
public AdivinarNumeroException() {
}

/**
 * Constructs an instance of <code>AdivinarNumeroExepcion</code> with the
 * specified detail message.
 *
 * @param msg the detail message.
 */
public AdivinarNumeroException(String msg) {
	super(msg);
}
}
