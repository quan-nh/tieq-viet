(ns tieq-viet.core-test
  (:require [clojure.test :refer :all]
            [tieq-viet.core :refer :all]))

(deftest a-test
  (testing "encode"
    (is (= "LUẬT ZÁO ZỤK

Diều 7. Qôn qữ zùq coq n'à cườq và kơ sở záo zụk xák; zạy và họk tiếq nói, cữ viết kủa zân tộk wiểu số; zạy qoại qữ.

1. Tiếq Việt là qôn qữ cín' wứk zùq coq n'à cườq và kơ sở záo zụk xák. Kăn kứ vào mụk tiêu záo zụk và yêu kầu kụ wể về nội zuq záo zụk, Wủ tướq cín' fủ kuy dịn' việk zạy và họk bằq tiếq nướk qoài coq n'à cườq và kơ sở záo zụk xák.

2. N'à nướk tạo diều kiện dể qười zân tộk wiểu số dượk họk tiếq nói, cữ viết kủa zân tộk mìn' n'ằm zữ zìn và fát huy bản sắk văn hoá zân tộk, zúp co họk sin' qười zân tộk wiểu số zễ zàq tiếp wu kiến wứk xi họk tập coq n'à cườq và kơ sở záo zụk xák. Việk zạy và họk tiếq nói, cữ viết kủa zân tộk wiểu số dượk wựk hiện weo kuy dịn' kủa Cín' fủ.

3. Qoại qữ kuy dịn' coq cươq cìn' záo zụk là qôn qữ dượk sử zụq fổ biến coq zao zịc kuốk tế. Việk tổ cứk zạy qoại qữ coq n'à cườq và kơ sở záo zụk xák kần dảm bảo dể qười họk dượk họk liên tụk và kó hiệu kuả."
           (encode "LUẬT GIÁO DỤC

Điều 7. Ngôn ngữ dùng trong nhà trường và cơ sở giáo dục khác; dạy và học tiếng nói, chữ viết của dân tộc thiểu số; dạy ngoại ngữ.

1. Tiếng Việt là ngôn ngữ chính thức dùng trong nhà trường và cơ sở giáo dục khác. Căn cứ vào mục tiêu giáo dục và yêu cầu cụ thể về nội dung giáo dục, Thủ tướng chính phủ quy định việc dạy và học bằng tiếng nước ngoài trong nhà trường và cơ sở giáo dục khác.

2. Nhà nước tạo điều kiện để người dân tộc thiểu số được học tiếng nói, chữ viết của dân tộc mình nhằm giữ gìn và phát huy bản sắc văn hoá dân tộc, giúp cho học sinh người dân tộc thiểu số dễ dàng tiếp thu kiến thức khi học tập trong nhà trường và cơ sở giáo dục khác. Việc dạy và học tiếng nói, chữ viết của dân tộc thiểu số được thực hiện theo quy định của Chính phủ.

3. Ngoại ngữ quy định trong chương trình giáo dục là ngôn ngữ được sử dụng phổ biến trong giao dịch quốc tế. Việc tổ chức dạy ngoại ngữ trong nhà trường và cơ sở giáo dục khác cần đảm bảo để người học được học liên tục và có hiệu quả.")))

    (is (= "Coq dầm zì dẹp bằq sen"
           (encode "Trong đầm gì đẹp bằng sen")))
    (is (= "COQ DẦM ZÌ DẸP BẰQ SEN"
           (encode "TRONG ĐẦM GÌ ĐẸP BẰNG SEN")))
    (is (= "Coq dầm Zì dẹp bằq sen"
           (encode "Trong đầm Gì đẹp bằng sen")))
    (is (= "Coq dầm zÌ dẹp bằq sen"
           (encode "Trong đầm gÌ đẹp bằng sen")))

    (is (= "Zữ zÌn sự coq sáq kủa tiếq Việt."
           (encode "Giữ gÌn sự trong sáng của tiếng Việt.")))))
