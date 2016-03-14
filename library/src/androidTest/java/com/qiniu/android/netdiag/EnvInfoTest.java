package com.qiniu.android.netdiag;

import android.test.AndroidTestCase;

import junit.framework.Assert;

/**
 * Created by bailong on 16/3/14.
 */
public class EnvInfoTest extends AndroidTestCase {

    public void testTotalCpu(){
        EnvInfo.CpuInfo cpu = EnvInfo.cpuInfo();
        Assert.assertTrue(cpu.total > cpu.current && cpu.current>0);
    }
}