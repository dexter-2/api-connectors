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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Create Linear Order
 **/
@ApiModel(description = "Create Linear Order")
public class LinearCreateOrderResult {
  
  @SerializedName("created_time")
  private String createdTime = null;
  @SerializedName("cum_exec_fee")
  private Double cumExecFee = null;
  @SerializedName("cum_exec_qty")
  private Double cumExecQty = null;
  @SerializedName("cum_exec_value")
  private Double cumExecValue = null;
  @SerializedName("last_exec_price")
  private Double lastExecPrice = null;
  @SerializedName("order_id")
  private String orderId = null;
  @SerializedName("order_link_id")
  private String orderLinkId = null;
  @SerializedName("order_status")
  private String orderStatus = null;
  @SerializedName("order_type")
  private String orderType = null;
  @SerializedName("price")
  private Double price = null;
  @SerializedName("qty")
  private Double qty = null;
  @SerializedName("reduce_only")
  private Boolean reduceOnly = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("time_in_force")
  private String timeInForce = null;
  @SerializedName("updated_time")
  private String updatedTime = null;
  @SerializedName("user_id")
  private Long userId = null;
  @SerializedName("take_profit")
  private Double takeProfit = null;
  @SerializedName("stop_loss")
  private Double stopLoss = null;
  @SerializedName("tp_trigger_by")
  private String tpTriggerBy = null;
  @SerializedName("sl_trigger_by")
  private String slTriggerBy = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCumExecFee() {
    return cumExecFee;
  }
  public void setCumExecFee(Double cumExecFee) {
    this.cumExecFee = cumExecFee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCumExecQty() {
    return cumExecQty;
  }
  public void setCumExecQty(Double cumExecQty) {
    this.cumExecQty = cumExecQty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCumExecValue() {
    return cumExecValue;
  }
  public void setCumExecValue(Double cumExecValue) {
    this.cumExecValue = cumExecValue;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLastExecPrice() {
    return lastExecPrice;
  }
  public void setLastExecPrice(Double lastExecPrice) {
    this.lastExecPrice = lastExecPrice;
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
  public String getOrderLinkId() {
    return orderLinkId;
  }
  public void setOrderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderStatus() {
    return orderStatus;
  }
  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
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
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getQty() {
    return qty;
  }
  public void setQty(Double qty) {
    this.qty = qty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReduceOnly() {
    return reduceOnly;
  }
  public void setReduceOnly(Boolean reduceOnly) {
    this.reduceOnly = reduceOnly;
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
  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTakeProfit() {
    return takeProfit;
  }
  public void setTakeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getStopLoss() {
    return stopLoss;
  }
  public void setStopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTpTriggerBy() {
    return tpTriggerBy;
  }
  public void setTpTriggerBy(String tpTriggerBy) {
    this.tpTriggerBy = tpTriggerBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSlTriggerBy() {
    return slTriggerBy;
  }
  public void setSlTriggerBy(String slTriggerBy) {
    this.slTriggerBy = slTriggerBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearCreateOrderResult linearCreateOrderResult = (LinearCreateOrderResult) o;
    return (this.createdTime == null ? linearCreateOrderResult.createdTime == null : this.createdTime.equals(linearCreateOrderResult.createdTime)) &&
        (this.cumExecFee == null ? linearCreateOrderResult.cumExecFee == null : this.cumExecFee.equals(linearCreateOrderResult.cumExecFee)) &&
        (this.cumExecQty == null ? linearCreateOrderResult.cumExecQty == null : this.cumExecQty.equals(linearCreateOrderResult.cumExecQty)) &&
        (this.cumExecValue == null ? linearCreateOrderResult.cumExecValue == null : this.cumExecValue.equals(linearCreateOrderResult.cumExecValue)) &&
        (this.lastExecPrice == null ? linearCreateOrderResult.lastExecPrice == null : this.lastExecPrice.equals(linearCreateOrderResult.lastExecPrice)) &&
        (this.orderId == null ? linearCreateOrderResult.orderId == null : this.orderId.equals(linearCreateOrderResult.orderId)) &&
        (this.orderLinkId == null ? linearCreateOrderResult.orderLinkId == null : this.orderLinkId.equals(linearCreateOrderResult.orderLinkId)) &&
        (this.orderStatus == null ? linearCreateOrderResult.orderStatus == null : this.orderStatus.equals(linearCreateOrderResult.orderStatus)) &&
        (this.orderType == null ? linearCreateOrderResult.orderType == null : this.orderType.equals(linearCreateOrderResult.orderType)) &&
        (this.price == null ? linearCreateOrderResult.price == null : this.price.equals(linearCreateOrderResult.price)) &&
        (this.qty == null ? linearCreateOrderResult.qty == null : this.qty.equals(linearCreateOrderResult.qty)) &&
        (this.reduceOnly == null ? linearCreateOrderResult.reduceOnly == null : this.reduceOnly.equals(linearCreateOrderResult.reduceOnly)) &&
        (this.side == null ? linearCreateOrderResult.side == null : this.side.equals(linearCreateOrderResult.side)) &&
        (this.symbol == null ? linearCreateOrderResult.symbol == null : this.symbol.equals(linearCreateOrderResult.symbol)) &&
        (this.timeInForce == null ? linearCreateOrderResult.timeInForce == null : this.timeInForce.equals(linearCreateOrderResult.timeInForce)) &&
        (this.updatedTime == null ? linearCreateOrderResult.updatedTime == null : this.updatedTime.equals(linearCreateOrderResult.updatedTime)) &&
        (this.userId == null ? linearCreateOrderResult.userId == null : this.userId.equals(linearCreateOrderResult.userId)) &&
        (this.takeProfit == null ? linearCreateOrderResult.takeProfit == null : this.takeProfit.equals(linearCreateOrderResult.takeProfit)) &&
        (this.stopLoss == null ? linearCreateOrderResult.stopLoss == null : this.stopLoss.equals(linearCreateOrderResult.stopLoss)) &&
        (this.tpTriggerBy == null ? linearCreateOrderResult.tpTriggerBy == null : this.tpTriggerBy.equals(linearCreateOrderResult.tpTriggerBy)) &&
        (this.slTriggerBy == null ? linearCreateOrderResult.slTriggerBy == null : this.slTriggerBy.equals(linearCreateOrderResult.slTriggerBy));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.createdTime == null ? 0: this.createdTime.hashCode());
    result = 31 * result + (this.cumExecFee == null ? 0: this.cumExecFee.hashCode());
    result = 31 * result + (this.cumExecQty == null ? 0: this.cumExecQty.hashCode());
    result = 31 * result + (this.cumExecValue == null ? 0: this.cumExecValue.hashCode());
    result = 31 * result + (this.lastExecPrice == null ? 0: this.lastExecPrice.hashCode());
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.orderLinkId == null ? 0: this.orderLinkId.hashCode());
    result = 31 * result + (this.orderStatus == null ? 0: this.orderStatus.hashCode());
    result = 31 * result + (this.orderType == null ? 0: this.orderType.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.reduceOnly == null ? 0: this.reduceOnly.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.updatedTime == null ? 0: this.updatedTime.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.takeProfit == null ? 0: this.takeProfit.hashCode());
    result = 31 * result + (this.stopLoss == null ? 0: this.stopLoss.hashCode());
    result = 31 * result + (this.tpTriggerBy == null ? 0: this.tpTriggerBy.hashCode());
    result = 31 * result + (this.slTriggerBy == null ? 0: this.slTriggerBy.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearCreateOrderResult {\n");
    
    sb.append("  createdTime: ").append(createdTime).append("\n");
    sb.append("  cumExecFee: ").append(cumExecFee).append("\n");
    sb.append("  cumExecQty: ").append(cumExecQty).append("\n");
    sb.append("  cumExecValue: ").append(cumExecValue).append("\n");
    sb.append("  lastExecPrice: ").append(lastExecPrice).append("\n");
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  orderLinkId: ").append(orderLinkId).append("\n");
    sb.append("  orderStatus: ").append(orderStatus).append("\n");
    sb.append("  orderType: ").append(orderType).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  reduceOnly: ").append(reduceOnly).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  updatedTime: ").append(updatedTime).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  takeProfit: ").append(takeProfit).append("\n");
    sb.append("  stopLoss: ").append(stopLoss).append("\n");
    sb.append("  tpTriggerBy: ").append(tpTriggerBy).append("\n");
    sb.append("  slTriggerBy: ").append(slTriggerBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
