package com.shanghai.stock.OKcoinHuobi;

import com.shanghai.stock.OKcoinHuobi.Huobi.Stock.HuobiService;
import com.shanghai.stock.OKcoinHuobi.OKcoin.Stock.IStockApi;
import com.shanghai.stock.OKcoinHuobi.OKcoin.Stock.StockApi;
import com.shanghai.stock.OKcoinHuobi.OKcoin.Util.GetRest;
import com.shanghai.stock.OKcoinHuobi.OKcoin.Util.HuobiRealTimeData;
import com.shanghai.stock.OKcoinHuobi.OKcoin.Util.OKCoinRealTimeData;

public class TradeAutoDiff implements Runnable{
	
	private static float COINPERTIME = (float) 0.1;
	private static float MINCASH = 3000;
	private static float MINBTCLEFT = 1;
	private static float BALANCETRIGGER = (float) 0.1;
	//private static float MINLTCLEFT = 0;
	//private static float CONSTBTC = (float) 0.2;
	//private static float CONSTLTC = 30;
	private static float MINDIFF = (float) 0.5;//
	private static float INITBTC = (float) 132.64;
	
	//private float okCoinBtc;
	//private float okCoinLtc;
	//private float okCoinCash;
	//private float huoBiBtc;
	//private float huoBiLtc;
	//private float huoBiCash;
	
	//private float[] coinBtcDiff; //OkCoin-HuoBi
	//private float[] coinLtcDiff; //OkCoin-HuoBi
	
	private static String API_KEY = "bce9358d-54e9-4cfb-b22d-3546e10e7dc1";  //OKCoin申请的apiKey
	private static String SECRET_KEY = "6641776BE6A7E7EEAC1D710569F3B0D2";  //OKCoin 申请的secret_key
	private static String URL_PREX = "https://www.okcoin.cn";
	
	private static String BUY = "buy";
    //private static String BUY_MARKET = "buy_market";
    //private static String CANCEL_ORDER = "cancel_order";
    private static String ACCOUNT_INFO = "get_account_info";
    //private static String NEW_DEAL_ORDERS = "get_new_deal_orders";
    //private static String ORDER_ID_BY_TRADE_ID = "get_order_id_by_trade_id";
    //private static String GET_ORDERS = "get_orders";
    //private static String ORDER_INFO = "order_info";
    private static String SELL = "sell";
    //private static String SELL_MARKET = "sell_market";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {
		// TODO Auto-generated method stub
		IStockApi okcoinGet = new StockApi(URL_PREX);
		IStockApi okcoinPost = new StockApi(URL_PREX, API_KEY, SECRET_KEY);
		GetRest getRest = new GetRest();
		HuobiService service = new HuobiService();
		HuobiRealTimeData HuoData = new HuobiRealTimeData();
		OKCoinRealTimeData OkCoinData = new OKCoinRealTimeData();
	}

}
