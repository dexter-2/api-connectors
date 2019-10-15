=begin
#Bybit API

### REST API for the Bybit Exchange. 

OpenAPI spec version: 1.0.0
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'uri'

module SwaggerClient
  class WalletApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get wallet fund records
    # @param [Hash] opts the optional parameters
    # @option opts [String] :start_date Start point for result
    # @option opts [String] :end_date End point for result
    # @option opts [String] :currency Currency type
    # @option opts [String] :wallet_fund_type wallet fund type
    # @option opts [String] :page Page. Default getting first page data
    # @option opts [String] :limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page
    # @return [Object]
    def wallet_get_records(opts = {})
      data, _status_code, _headers = wallet_get_records_with_http_info(opts)
      data
    end

    # Get wallet fund records
    # @param [Hash] opts the optional parameters
    # @option opts [String] :start_date Start point for result
    # @option opts [String] :end_date End point for result
    # @option opts [String] :currency Currency type
    # @option opts [String] :wallet_fund_type wallet fund type
    # @option opts [String] :page Page. Default getting first page data
    # @option opts [String] :limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def wallet_get_records_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WalletApi.wallet_get_records ...'
      end
      # resource path
      local_var_path = '/open-api/wallet/fund/records'

      # query parameters
      query_params = {}
      query_params[:'start_date'] = opts[:'start_date'] if !opts[:'start_date'].nil?
      query_params[:'end_date'] = opts[:'end_date'] if !opts[:'end_date'].nil?
      query_params[:'currency'] = opts[:'currency'] if !opts[:'currency'].nil?
      query_params[:'wallet_fund_type'] = opts[:'wallet_fund_type'] if !opts[:'wallet_fund_type'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WalletApi#wallet_get_records\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
