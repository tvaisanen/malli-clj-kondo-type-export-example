{:linters
 {:unresolved-symbol {:exclude [(malli.core/=>)]},
  :type-mismatch
  {:namespaces
   {com.tvaisanen.clj-kondo-types-example.core

    {render-point {:arities {1 {:args [{:op  :keys,
                                        :req {:x :int,
                                              :y :int}}],
                                :ret  :string}}},
     add-points   {:arities {2 {:args [{:op  :keys,
                                        :req {:x :int,
                                              :y :int}}
                                       {:op  :keys,
                                        :req {:x :int,
                                              :y :int}}],
                                :ret  {:op  :keys,
                                       :req {:x :int,
                                             :y :int}}}}}}}}}}
