package GroupID.readJasonPractice;

import org.json.JSONObject;

public class PracticeJason {

	
	static String inputMethod() {
		String input = "{\r\n" + 
				"  \"total\": 51957,\r\n" + 
				"  \"limit\": 10,\r\n" + 
				"  \"skip\": 0,\r\n" + 
				"  \"data\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 43900,\r\n" + 
				"      \"name\": \"Duracell - AAA Batteries (4-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 5.49,\r\n" + 
				"      \"upc\": \"041333424019\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Compatible with select electronic devices; AAA size; DURALOCK Power Preserve technology; 4-pack\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN2400B4Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-aaa-batteries-4-pack/43900.p?id=1051384074145&skuId=43900&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/4390/43900_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 48530,\r\n" + 
				"      \"name\": \"Duracell - AA 1.5V CopperTop Batteries (4-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 5.49,\r\n" + 
				"      \"upc\": \"041333415017\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Long-lasting energy; DURALOCK Power Preserve technology; for toys, clocks, radios, games, remotes, PDAs and more\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN1500B4Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-aa-1-5v-coppertop-batteries-4-pack/48530.p?id=1099385268988&skuId=48530&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/4853/48530_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 127687,\r\n" + 
				"      \"name\": \"Duracell - AA Batteries (8-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 7.49,\r\n" + 
				"      \"upc\": \"041333825014\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Compatible with select electronic devices; AA size; DURALOCK Power Preserve technology; 8-pack\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN1500B8Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-aa-batteries-8-pack/127687.p?id=1051384045676&skuId=127687&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/1276/127687_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 150115,\r\n" + 
				"      \"name\": \"Energizer - MAX Batteries AA (4-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 4.99,\r\n" + 
				"      \"upc\": \"039800011329\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"4-pack AA alkaline batteries; battery tester included\",\r\n" + 
				"      \"manufacturer\": \"Energizer\",\r\n" + 
				"      \"model\": \"E91BP-4\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/energizer-max-batteries-aa-4-pack/150115.p?id=1051384046217&skuId=150115&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/1501/150115_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 185230,\r\n" + 
				"      \"name\": \"Duracell - C Batteries (4-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 8.99,\r\n" + 
				"      \"upc\": \"041333440019\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Compatible with select electronic devices; C size; DURALOCK Power Preserve technology; 4-pack\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN1400R4Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-c-batteries-4-pack/185230.p?id=1051384046486&skuId=185230&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/1852/185230_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 185267,\r\n" + 
				"      \"name\": \"Duracell - D Batteries (4-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 9.99,\r\n" + 
				"      \"upc\": \"041333430010\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Compatible with select electronic devices; D size; DURALOCK Power Preserve technology; 4-pack\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN1300R4Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-d-batteries-4-pack/185267.p?id=1051384046551&skuId=185267&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/1852/185267_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 309062,\r\n" + 
				"      \"name\": \"Pioneer - 4\\\" 3-Way Surface-Mount Speakers with IMPP Composite Cones (Pair) - Black\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 144.99,\r\n" + 
				"      \"upc\": \"012562165141\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"80W maximum power (20W RMS); 4\\\" IMPP composite cone woofer; 3/4\\\" horn tweeter\",\r\n" + 
				"      \"manufacturer\": \"Pioneer\",\r\n" + 
				"      \"model\": \"TS-X200\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/pioneer-4-3-way-surface-mount-speakers-with-impp-composite-cones-pair-black/309062.p?id=1218643240258&skuId=309062&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/0309/0309062_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0300000\",\r\n" + 
				"          \"name\": \"Car Electronics & GPS\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0302000\",\r\n" + 
				"          \"name\": \"Car Audio\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0302005\",\r\n" + 
				"          \"name\": \"Car Speakers\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat360500050015\",\r\n" + 
				"          \"name\": \"4\\\" Car Speakers\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.643Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.643Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 312290,\r\n" + 
				"      \"name\": \"Duracell - 9V Batteries (2-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 7.99,\r\n" + 
				"      \"upc\": \"041333216010\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Compatible with select electronic devices; alkaline chemistry; 9V size; DURALOCK Power Preserve technology; 2-pack\",\r\n" + 
				"      \"manufacturer\": \"Duracell\",\r\n" + 
				"      \"model\": \"MN1604B2Z\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/duracell-9v-batteries-2-pack/312290.p?id=1051384050321&skuId=312290&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/3122/312290_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208002\",\r\n" + 
				"          \"name\": \"Alkaline Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 333179,\r\n" + 
				"      \"name\": \"Energizer - N Cell E90 Batteries (2-Pack)\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 5.99,\r\n" + 
				"      \"upc\": \"039800013200\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"Alkaline batteries; 1.5V\",\r\n" + 
				"      \"manufacturer\": \"Energizer\",\r\n" + 
				"      \"model\": \"E90BP-2\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/energizer-n-cell-e90-batteries-2-pack/333179.p?id=1185268509951&skuId=333179&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/3331/333179_sa.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0208006\",\r\n" + 
				"          \"name\": \"Specialty Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat248700050021\",\r\n" + 
				"          \"name\": \"Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat303600050001\",\r\n" + 
				"          \"name\": \"Household Batteries\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat312300050015\",\r\n" + 
				"          \"name\": \"Connected Home & Housewares\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"id\": 346575,\r\n" + 
				"      \"name\": \"Metra - Radio Installation Dash Kit for Most 1989-2000 Ford, Lincoln & Mercury Vehicles - Black\",\r\n" + 
				"      \"type\": \"HardGood\",\r\n" + 
				"      \"price\": 16.99,\r\n" + 
				"      \"upc\": \"086429002757\",\r\n" + 
				"      \"shipping\": 0,\r\n" + 
				"      \"description\": \"From our expanded online assortment; compatible with most 1989-2000 Ford, Lincoln and Mercury vehicles; snap-in TurboKit offers fast installation; spacer/trim ring; rear support bracket\",\r\n" + 
				"      \"manufacturer\": \"Metra\",\r\n" + 
				"      \"model\": \"99-5512\",\r\n" + 
				"      \"url\": \"http://www.bestbuy.com/site/metra-radio-installation-dash-kit-for-most-1989-2000-ford-lincoln-mercury-vehicles-black/346575.p?id=1218118704590&skuId=346575&cmp=RMXCC\",\r\n" + 
				"      \"image\": \"http://img.bbystatic.com/BestBuy_US/images/products/3465/346575_rc.jpg\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:58:03.298Z\",\r\n" + 
				"      \"categories\": [\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"abcat0300000\",\r\n" + 
				"          \"name\": \"Car Electronics & GPS\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.285Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.285Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat165900050023\",\r\n" + 
				"          \"name\": \"Car Installation Parts & Accessories\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat165900050031\",\r\n" + 
				"          \"name\": \"Deck Installation Parts\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat165900050033\",\r\n" + 
				"          \"name\": \"Dash Installation Kits\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:05.399Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:05.399Z\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"id\": \"pcmcat331600050007\",\r\n" + 
				"          \"name\": \"Car Audio Installation Parts\",\r\n" + 
				"          \"createdAt\": \"2016-11-17T17:57:04.643Z\",\r\n" + 
				"          \"updatedAt\": \"2016-11-17T17:57:04.643Z\"\r\n" + 
				"        }\r\n" + 
				"      ]\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		return input;
	}
	
	
}
