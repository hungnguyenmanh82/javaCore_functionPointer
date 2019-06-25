package com.example.function;


/**
 * 
 * @FunctionalInterface: interface này bắt buộc chỉ có duy nhất 1 function
 * 
 * neu muon function pointer co 2 parame thì ta khai bao 2 param o day
 */
@FunctionalInterface
public interface Handler2<E,K> {

  /**
   * Something has happened, so handle it.
   *
   * @param event  the event to handle
   */
  void handle(E e, K k);
}

