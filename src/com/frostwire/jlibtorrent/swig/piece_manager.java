/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class piece_manager {
  private long swigCPtr;
  private boolean swigCMemOwnBase;

  protected piece_manager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwnBase = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(piece_manager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwnBase) {
      swigCMemOwnBase = false;
      libtorrent_jni.delete_piece_manager(swigCPtr);
    }
    swigCPtr = 0;
  }

  public piece_manager(SWIGTYPE_p_boost__shared_ptrT_void_t torrent, SWIGTYPE_p_boost__intrusive_ptrT_torrent_info_const_t info, String path, file_pool fp, disk_io_thread io, SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t sc, storage_mode_t sm, unsigned_char_vector file_prio) {
    this(libtorrent_jni.new_piece_manager(SWIGTYPE_p_boost__shared_ptrT_void_t.getCPtr(torrent), SWIGTYPE_p_boost__intrusive_ptrT_torrent_info_const_t.getCPtr(info), path, file_pool.getCPtr(fp), fp, disk_io_thread.getCPtr(io), io, SWIGTYPE_p_boost__functionT_libtorrent__storage_interface_pflibtorrent__file_storage_const_R_libtorrent__file_storage_const_p_std__string_const_R_libtorrent__file_pool_R_std__vectorT_boost__uint8_t_t_const_RF_t.getCPtr(sc), sm.swigValue(), unsigned_char_vector.getCPtr(file_prio), file_prio), true);
  }

  public SWIGTYPE_p_boost__intrusive_ptrT_torrent_info_const_t info() {
    return new SWIGTYPE_p_boost__intrusive_ptrT_torrent_info_const_t(libtorrent_jni.piece_manager_info(swigCPtr, this), true);
  }

  public void write_resume_data(entry rd) {
    libtorrent_jni.piece_manager_write_resume_data(swigCPtr, this, entry.getCPtr(rd), rd);
  }

  public void abort_disk_io() {
    libtorrent_jni.piece_manager_abort_disk_io(swigCPtr, this);
  }

  public storage_interface get_storage_impl() {
    long cPtr = libtorrent_jni.piece_manager_get_storage_impl(swigCPtr, this);
    return (cPtr == 0) ? null : new storage_interface(cPtr, false);
  }

  public enum return_t {
    no_error(libtorrent_jni.piece_manager_no_error_get()),
    need_full_check(libtorrent_jni.piece_manager_need_full_check_get()),
    fatal_disk_error(libtorrent_jni.piece_manager_fatal_disk_error_get()),
    disk_check_aborted(libtorrent_jni.piece_manager_disk_check_aborted_get()),
    file_exist(libtorrent_jni.piece_manager_file_exist_get());

    public final int swigValue() {
      return swigValue;
    }

    public static return_t swigToEnum(int swigValue) {
      return_t[] swigValues = return_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (return_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + return_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private return_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private return_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private return_t(return_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
