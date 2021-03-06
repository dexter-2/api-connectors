/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Get the trade records of a order response
 **/
@ApiModel(description = "Get the trade records of a order response")
public class TradeRecordsInfo {
  
  @SerializedName("closed_size")
  private BigDecimal closedSize = null;
  @SerializedName("cross_seq")
  private BigDecimal crossSeq = null;
  @SerializedName("exec_fee")
  private String execFee = null;
  @SerializedName("exec_id")
  private String execId = null;
  @SerializedName("exec_price")
  private String execPrice = null;
  @SerializedName("exec_qty")
  private BigDecimal execQty = null;
  @SerializedName("exec_time")
  private String execTime = null;
  @SerializedName("exec_type")
  private String execType = null;
  @SerializedName("exec_value")
  private String execValue = null;
  @SerializedName("fee_rate")
  private String feeRate = null;
  @SerializedName("last_liquidity_ind")
  private String lastLiquidityInd = null;
  @SerializedName("leaves_qty")
  private BigDecimal leavesQty = null;
  @SerializedName("nth_fill")
  private BigDecimal nthFill = null;
  @SerializedName("order_id")
  private String orderId = null;
  @SerializedName("order_price")
  private String orderPrice = null;
  @SerializedName("order_qty")
  private BigDecimal orderQty = null;
  @SerializedName("order_type")
  private String orderType = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("user_id")
  private BigDecimal userId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getClosedSize() {
    return closedSize;
  }
  public void setClosedSize(BigDecimal closedSize) {
    this.closedSize = closedSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCrossSeq() {
    return crossSeq;
  }
  public void setCrossSeq(BigDecimal crossSeq) {
    this.crossSeq = crossSeq;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecFee() {
    return execFee;
  }
  public void setExecFee(String execFee) {
    this.execFee = execFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecId() {
    return execId;
  }
  public void setExecId(String execId) {
    this.execId = execId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecPrice() {
    return execPrice;
  }
  public void setExecPrice(String execPrice) {
    this.execPrice = execPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExecQty() {
    return execQty;
  }
  public void setExecQty(BigDecimal execQty) {
    this.execQty = execQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecTime() {
    return execTime;
  }
  public void setExecTime(String execTime) {
    this.execTime = execTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecType() {
    return execType;
  }
  public void setExecType(String execType) {
    this.execType = execType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExecValue() {
    return execValue;
  }
  public void setExecValue(String execValue) {
    this.execValue = execValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFeeRate() {
    return feeRate;
  }
  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getNthFill() {
    return nthFill;
  }
  public void setNthFill(BigDecimal nthFill) {
    this.nthFill = nthFill;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderPrice() {
    return orderPrice;
  }
  public void setOrderPrice(String orderPrice) {
    this.orderPrice = orderPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(BigDecimal orderQty) {
    this.orderQty = orderQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }
  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeRecordsInfo tradeRecordsInfo = (TradeRecordsInfo) o;
    return (this.closedSize == null ? tradeRecordsInfo.closedSize == null : this.closedSize.equals(tradeRecordsInfo.closedSize)) &&
        (this.crossSeq == null ? tradeRecordsInfo.crossSeq == null : this.crossSeq.equals(tradeRecordsInfo.crossSeq)) &&
        (this.execFee == null ? tradeRecordsInfo.execFee == null : this.execFee.equals(tradeRecordsInfo.execFee)) &&
        (this.execId == null ? tradeRecordsInfo.execId == null : this.execId.equals(tradeRecordsInfo.execId)) &&
        (this.execPrice == null ? tradeRecordsInfo.execPrice == null : this.execPrice.equals(tradeRecordsInfo.execPrice)) &&
        (this.execQty == null ? tradeRecordsInfo.execQty == null : this.execQty.equals(tradeRecordsInfo.execQty)) &&
        (this.execTime == null ? tradeRecordsInfo.execTime == null : this.execTime.equals(tradeRecordsInfo.execTime)) &&
        (this.execType == null ? tradeRecordsInfo.execType == null : this.execType.equals(tradeRecordsInfo.execType)) &&
        (this.execValue == null ? tradeRecordsInfo.execValue == null : this.execValue.equals(tradeRecordsInfo.execValue)) &&
        (this.feeRate == null ? tradeRecordsInfo.feeRate == null : this.feeRate.equals(tradeRecordsInfo.feeRate)) &&
        (this.lastLiquidityInd == null ? tradeRecordsInfo.lastLiquidityInd == null : this.lastLiquidityInd.equals(tradeRecordsInfo.lastLiquidityInd)) &&
        (this.leavesQty == null ? tradeRecordsInfo.leavesQty == null : this.leavesQty.equals(tradeRecordsInfo.leavesQty)) &&
        (this.nthFill == null ? tradeRecordsInfo.nthFill == null : this.nthFill.equals(tradeRecordsInfo.nthFill)) &&
        (this.orderId == null ? tradeRecordsInfo.orderId == null : this.orderId.equals(tradeRecordsInfo.orderId)) &&
        (this.orderPrice == null ? tradeRecordsInfo.orderPrice == null : this.orderPrice.equals(tradeRecordsInfo.orderPrice)) &&
        (this.orderQty == null ? tradeRecordsInfo.orderQty == null : this.orderQty.equals(tradeRecordsInfo.orderQty)) &&
        (this.orderType == null ? tradeRecordsInfo.orderType == null : this.orderType.equals(tradeRecordsInfo.orderType)) &&
        (this.side == null ? tradeRecordsInfo.side == null : this.side.equals(tradeRecordsInfo.side)) &&
        (this.symbol == null ? tradeRecordsInfo.symbol == null : this.symbol.equals(tradeRecordsInfo.symbol)) &&
        (this.userId == null ? tradeRecordsInfo.userId == null : this.userId.equals(tradeRecordsInfo.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.closedSize == null ? 0: this.closedSize.hashCode());
    result = 31 * result + (this.crossSeq == null ? 0: this.crossSeq.hashCode());
    result = 31 * result + (this.execFee == null ? 0: this.execFee.hashCode());
    result = 31 * result + (this.execId == null ? 0: this.execId.hashCode());
    result = 31 * result + (this.execPrice == null ? 0: this.execPrice.hashCode());
    result = 31 * result + (this.execQty == null ? 0: this.execQty.hashCode());
    result = 31 * result + (this.execTime == null ? 0: this.execTime.hashCode());
    result = 31 * result + (this.execType == null ? 0: this.execType.hashCode());
    result = 31 * result + (this.execValue == null ? 0: this.execValue.hashCode());
    result = 31 * result + (this.feeRate == null ? 0: this.feeRate.hashCode());
    result = 31 * result + (this.lastLiquidityInd == null ? 0: this.lastLiquidityInd.hashCode());
    result = 31 * result + (this.leavesQty == null ? 0: this.leavesQty.hashCode());
    result = 31 * result + (this.nthFill == null ? 0: this.nthFill.hashCode());
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.orderPrice == null ? 0: this.orderPrice.hashCode());
    result = 31 * result + (this.orderQty == null ? 0: this.orderQty.hashCode());
    result = 31 * result + (this.orderType == null ? 0: this.orderType.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeRecordsInfo {\n");
    
    sb.append("  closedSize: ").append(closedSize).append("\n");
    sb.append("  crossSeq: ").append(crossSeq).append("\n");
    sb.append("  execFee: ").append(execFee).append("\n");
    sb.append("  execId: ").append(execId).append("\n");
    sb.append("  execPrice: ").append(execPrice).append("\n");
    sb.append("  execQty: ").append(execQty).append("\n");
    sb.append("  execTime: ").append(execTime).append("\n");
    sb.append("  execType: ").append(execType).append("\n");
    sb.append("  execValue: ").append(execValue).append("\n");
    sb.append("  feeRate: ").append(feeRate).append("\n");
    sb.append("  lastLiquidityInd: ").append(lastLiquidityInd).append("\n");
    sb.append("  leavesQty: ").append(leavesQty).append("\n");
    sb.append("  nthFill: ").append(nthFill).append("\n");
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  orderPrice: ").append(orderPrice).append("\n");
    sb.append("  orderQty: ").append(orderQty).append("\n");
    sb.append("  orderType: ").append(orderType).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
