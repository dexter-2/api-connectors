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

// Set risk limit.
type RiskIdRes struct {
	Id float32 `json:"id,omitempty"`
	Coin string `json:"coin,omitempty"`
	Limit float32 `json:"limit,omitempty"`
	MaintainMargin string `json:"maintain_margin,omitempty"`
	StartingMargin string `json:"starting_margin,omitempty"`
	Section string `json:"section,omitempty"`
	IsLowestRisk float32 `json:"is_lowest_risk,omitempty"`
	CreatedAt string `json:"created_at,omitempty"`
	UpdatedAt string `json:"updated_at,omitempty"`
}
