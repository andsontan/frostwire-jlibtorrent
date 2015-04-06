/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_outgoing_get_peers_alert extends alert {
  private long swigCPtr;

  protected dht_outgoing_get_peers_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_outgoing_get_peers_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_outgoing_get_peers_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_outgoing_get_peers_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public dht_outgoing_get_peers_alert(stack_allocator alloc, sha1_hash ih, sha1_hash obfih, udp_endpoint ep) {
    this(libtorrent_jni.new_dht_outgoing_get_peers_alert(stack_allocator.getCPtr(alloc), alloc, sha1_hash.getCPtr(ih), ih, sha1_hash.getCPtr(obfih), obfih, udp_endpoint.getCPtr(ep), ep), true);
  }

  public int type() {
    return libtorrent_jni.dht_outgoing_get_peers_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_outgoing_get_peers_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_outgoing_get_peers_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_outgoing_get_peers_alert_message(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.dht_outgoing_get_peers_alert_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.dht_outgoing_get_peers_alert_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setObfuscated_info_hash(sha1_hash value) {
    libtorrent_jni.dht_outgoing_get_peers_alert_obfuscated_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getObfuscated_info_hash() {
    long cPtr = libtorrent_jni.dht_outgoing_get_peers_alert_obfuscated_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setIp(udp_endpoint value) {
    libtorrent_jni.dht_outgoing_get_peers_alert_ip_set(swigCPtr, this, udp_endpoint.getCPtr(value), value);
  }

  public udp_endpoint getIp() {
    long cPtr = libtorrent_jni.dht_outgoing_get_peers_alert_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new udp_endpoint(cPtr, false);
  }

  public final static int priority = libtorrent_jni.dht_outgoing_get_peers_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_outgoing_get_peers_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_outgoing_get_peers_alert_static_category_get();
}
