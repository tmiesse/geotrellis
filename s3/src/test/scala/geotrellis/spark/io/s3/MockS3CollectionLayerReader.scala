package geotrellis.spark.io.s3

import geotrellis.spark.io._
import org.apache.spark._

class MockS3CollectionLayerReader(
  attributeStore: AttributeStore
)(implicit sc: SparkContext) extends S3CollectionLayerReader(attributeStore) {
  override def collectionReader =
    new S3CollectionReader {
      def getS3Client = () => new MockS3Client()
    }
}