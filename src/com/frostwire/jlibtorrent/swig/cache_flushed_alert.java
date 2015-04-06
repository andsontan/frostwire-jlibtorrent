/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class cache_flushed_alert extends torrent_alert {
  private long swigCPtr;

  protected cache_flushed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.cache_flushed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cache_flushed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_cache_flushed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public cache_flushed_alert(stack_allocator alloc, torrent_handle h) {
    this(libtorrent_jni.new_cache_flushed_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h), true);
  }

  public int type() {
    return libtorrent_jni.cache_flushed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.cache_flushed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.cache_flushed_alert_what(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.cache_flushed_alert_priority_get();
  public final static int alert_type = libtorrent_jni.cache_flushed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.cache_flushed_alert_static_category_get();
}
