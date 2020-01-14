package com.pcwl.demo.wxFee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WxFee {

    //totalAmount:      可退款的最大金额
    //returnAmount:     本次退款的金额
    //returnAmountOld:  已退款的金额
    //totalWxFee:       可退款的最大手续费:计算得来
    //returnWxFee:      本次退款返还的手续费
    //returnWxFeeOld:   已退还的手续费(需要新定义字段)

    private static BigDecimal getWxFee(BigDecimal totalAmount, BigDecimal returnAmount, BigDecimal returnAmountOld, BigDecimal returnWxFeeOld) throws Exception {

        sysoln(totalAmount, returnAmount, returnAmountOld, returnWxFeeOld);

        BigDecimal totalWxFee = (new BigDecimal(0.006).multiply(totalAmount)).setScale(2, RoundingMode.HALF_UP);
        Integer returnAmountAllAsInteger = totalAmount.compareTo(returnAmount.add(returnAmountOld));

        BigDecimal returnWxFee = null;

        if (returnAmountAllAsInteger == 0) {
            returnWxFee = totalWxFee.subtract(returnWxFeeOld);
        } else if (returnAmountAllAsInteger == 1) {
            returnWxFee = (new BigDecimal(0.006).multiply(returnAmount)).setScale(2, RoundingMode.HALF_UP);

            if (totalWxFee.compareTo(returnWxFee.add(returnWxFeeOld)) < 0) {
                returnWxFee = new BigDecimal("0");
            }
        } else {
            throw new Exception("退款金额大于支付金额");
        }
        System.out.println("本次退给用户的手续费为:" + returnWxFee);
        System.out.println("总共退给用户的手续费为" + returnWxFee.add(returnWxFeeOld));
        System.out.println("商户的实际金额减少:" + returnAmount.subtract(returnWxFee));
        return returnWxFee;
    }


    //调用方法测试:
    public static void main(String[] args) throws Exception {
        //传入的参数为:1.商品总金额:(可退款的最大金额)  2.本次退款金额  3.已退款金额     4.已退的手续费
        BigDecimal totalAmount = new BigDecimal("0.9");
        BigDecimal returnAmount = new BigDecimal("0.9");
        BigDecimal returnAmountOld = new BigDecimal("0");
        BigDecimal returnWxFeeOld = new BigDecimal("0");

        getWxFee(totalAmount, returnAmount, returnAmountOld, returnWxFeeOld);
    }


    private static void sysoln(BigDecimal totalAmount, BigDecimal returnAmount, BigDecimal returnAmountOld, BigDecimal returnWxFeeOld) {
        System.out.println("商品总金额:(可退款的最大金额):" + totalAmount);
        System.out.println("本次退款金额:" + returnAmount);
        System.out.println("已退款金额:" + returnAmountOld);
        System.out.println("已退的手续费" + returnWxFeeOld);
    }
}
