/*
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * API version: 0.2.10
 * Contact: support@bybit.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type LinearSearchStopOrderResult struct {
	StopOrderId string `json:"stop_order_id,omitempty"`
	UserId int64 `json:"user_id,omitempty"`
	Side string `json:"side,omitempty"`
	Symbol string `json:"symbol,omitempty"`
	OrderType string `json:"order_type,omitempty"`
	Price float64 `json:"price,omitempty"`
	Qty float64 `json:"qty,omitempty"`
	TimeInForce string `json:"time_in_force,omitempty"`
	OrderStatus string `json:"order_status,omitempty"`
	TriggerPrice float64 `json:"trigger_price,omitempty"`
	OrderLinkId string `json:"order_link_id,omitempty"`
	CreatedAt string `json:"created_at,omitempty"`
	UpdatedAt string `json:"updated_at,omitempty"`
	TakeProfit float64 `json:"take_profit,omitempty"`
	StopLoss float64 `json:"stop_loss,omitempty"`
	TpTriggerBy string `json:"tp_trigger_by,omitempty"`
	SlTriggerBy string `json:"sl_trigger_by,omitempty"`
}
