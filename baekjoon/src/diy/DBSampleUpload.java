//package diy;
//
//public class DBSampleUpload {
//	@Test
//	public void upload() {
//		List<ProductVO> pvoList = new ArrayList<ProductVO>();
//		List<ProductImgVO> pivoList = new ArrayList<ProductImgVO>();
//		
//		getVO(pvoList, pivoList);
//	}
//	
//	public void getVO(List<ProductVO> pvoList, List<ProductImgVO> pivoList) {
//		String isDir = "C:/sample/product2/";
//
//		//상품 분류
//		String[] sort = { "관엽/공기정화/분채", "다육/선인장", "동양란/서양란", "꽃바구니/꽃상자", "꽃다발" };
//
//		Map<String, String> sortName = new HashMap<String, String>();
//		sortName.put("bqt", "꽃다발");
//		sortName.put("bas", "꽃바구니");
//		sortName.put("box", "꽃상자");
//		sortName.put("ori", "동양란");
//		sortName.put("occ", "서양란");
//		
//		ArrayList<String> arrPrdName = new ArrayList<String>();
//		// 하위의 모든 디렉토리 (상품 이름)
//		for (File info : FileUtils.listFilesAndDirs(new File(isDir), TrueFileFilter.INSTANCE,
//				TrueFileFilter.INSTANCE)) {
//			// 상품 이름
//			if (info.isDirectory() && !(info.getName().equals("product2"))) {
//				arrPrdName.add(info.getName());
//			}
//		}
//		
//		int index = 1;
//		int i_num = 176;
//		String img_prd_num = "";
//		// 하위의 모든 파일 (첫번째 사진은 상품 고유번호) (사진 이름, 상품 분류 사용)
//		for (File info : FileUtils.listFiles(new File(isDir), TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE)) {
//			/* 상품 */
//			// 상품 분류
//			ProductVO pvo = new ProductVO();
//			if(!info.getName().equals("notice.PNG")) {
//				String type = sortName.get(info.getName().substring(0, 3));
//				for (String s : sort) {
//					if(s.contains(type)) pvo.setPrd_type(s);
//				}
//			}
//			
//			// 상품 번호, 상품 이름, 상품 가격, 상품 개수
//			if(info.getName().length() == 12) {
//				// 상품 개수 (20~50, 1개 단위)
//				pvo.setPrd_qty((int)(Math.random() * 50) + 20);
//				// 상품 가격 (10000 ~ 50000, 100원 단위)
//				pvo.setPrd_price(((int)(Math.random() * 50000) + 10000) / 100 * 100);
//				
//				pvo.setPrd_num(info.getName().replace(".png", ""));
//				pvo.setPrd_name(arrPrdName.get(index));
//				odao.productInsert(pvo);
//				
//				pvoList.add(pvo);
//				index++;
//			}
//			
//			/* 사진 */
//			if(info.getName().length() == 12) {
//				img_prd_num = info.getName().replace(".png", "");
//			}
//			
//			String fileName = "product" + "_" + UUID.randomUUID().toString().replaceAll("-", "") + "_" + info.getName();
//			// 사진 저장
//			imageSave(info, fileName);
//			
//			// 사진 번호, 사진 이름, 상품 번호
//			ProductImgVO pivo = new ProductImgVO();
//			pivo.setI_num(i_num);
//			pivo.setI_file(fileName);
//			pivo.setPrd_num(img_prd_num);
//			odao.imageInsert(pivo);
//
//			
//			pivoList.add(pivo);
//			i_num++;
//		}
//	}
//
//	private void imageSave(File file, String name) {
//		BufferedInputStream bis = null;
//		BufferedOutputStream bos = null;
//
//		int data = -1;
//		String dir = "C:\\sample\\product";
//		File dirSave = new File(dir);
//
//		try {
//			// 폴더 지정
//			File dirMake = new File(dirSave.getAbsolutePath());
//
//			// 폴더가 없을 시, 이미지 저장 폴더 생성
//			if (!dirMake.exists()) {
//				dirMake.mkdirs();
//			}
//
//			// 이미지 파일명 생성
//			bis = new BufferedInputStream(new FileInputStream(file));
//			bos = new BufferedOutputStream(
//					new FileOutputStream(dirMake.getAbsoluteFile() + "\\" + name));
//			
//			// 선택한 이미지 파일 InputStream의 마지막에 이르렀을 경우는 -1
//			while ((data = bis.read()) != -1) {
//				bos.write(data);
//				bos.flush();
//			}
//		} catch (Exception e) {
//			System.out.println("imageSave() error = " + e.getMessage());
//		} finally {
//			try {
//				if (bos != null)
//					bos.close();
//				if (bis != null)
//					bis.close();
//			} catch (IOException e) {
//				System.out.println("imageSave() error = " + e.getMessage());
//			}
//		}
//	}
//}
